package me.scriptori

import me.scriptori.model.Node

class MyTree(var root: Node) {
    companion object {
        const val LEVEL_NOT_FOUND = -1
        const val ROOT_NODE = 0
    }

    private val pathNodes = ArrayDeque<Node>()

    fun getLevel(data: String, node: Node? = root, level: Int = ROOT_NODE): Int = node?.let { n ->
        if (n.data != data) {
            getLevel(data, node.left, level + 1).let {
                if (it == LEVEL_NOT_FOUND) getLevel(data, node.right, level + 1) else it
            }
        } else {
            level
        }
    } ?: LEVEL_NOT_FOUND

    fun getPath(data: String): String? {
        return getPathNodes(data)?.let { list ->
            val path = StringBuilder()
            list.dropLast(1).forEach { n ->
                path.append("${n.data} -> ")
            }
            path.append(list.last().data)
            path.toString()
        }
    }

    fun getPathNodes(data: String): List<Node>? {
        pathNodes.clear()
        return if (hasNode(data)) pathNodes.toList() else null
    }

    private fun hasNode(data: String, node: Node? = root): Boolean {
        return node?.let {
            if (data == node.data || hasNode(data, node.left) || hasNode(data, node.right)) {
                pathNodes.addFirst(node)
                true
            } else false
        } ?: false
    }
}

