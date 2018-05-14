import java.io.File

class FileStorageManager: StorageManager {
    override fun init() {

    }


    override fun read(file_name: String): List<String> {
        return File(file_name).readLines()
    }

    override fun write(file_name: String) {
        File(file_name).printWriter().use { out ->
            out.write("Eu amo TP2!\nBonifácil é massa!")
        }
    }

    override fun length(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}