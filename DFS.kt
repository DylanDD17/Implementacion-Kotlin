// DFS con lista

fun dfs(graph: Map<Char, List<Char>>, node: Char, visited: MutableSet<Char> = mutableSetOf()) {
    if (node in visited) return  
    println("Visitando nodo $node")
    visited.add(node)

    for (neighbor in graph[node] ?: emptyList()) {
        dfs(graph, neighbor, visited)
    }
}

fun main() {
    val graph = mapOf(
        'A' to listOf('B', 'C'),
        'B' to listOf('D', 'E'),
        'C' to listOf('F'),
        'D' to listOf(),
        'E' to listOf('F'),
        'F' to listOf('G'),
        'G' to listOf()
    )

    dfs(graph, 'A')
}
