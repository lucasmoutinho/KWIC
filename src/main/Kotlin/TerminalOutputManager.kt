class TerminalOutputManager : OutputManager {
    override fun write(lines: List<String>){
        lines.forEach { s: String ->  println(s)}
    }
}