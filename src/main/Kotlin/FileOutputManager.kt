import java.io.File

class FileOutputManager: OutputManager {

    override fun write(lines: List<String>){
        val fileName = "saida.txt"
        File(fileName).printWriter().use { out ->
            lines.forEach {s: String ->
                out.println(s)
            }
        }
    }
}