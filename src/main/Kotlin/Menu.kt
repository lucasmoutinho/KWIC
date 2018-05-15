import java.io.File

object Menu {

    private fun outputMenu(lines: List<String>){
        var option: Int
        val kwic_manager = KWICManager()
        val storage_manager = FileStorageManager()
        val stop_words: List<String>
        stop_words = storage_manager.read("stop_words.txt")
        println()
        println("Escolha uma das opções abaixo:")
        println("0 - Para não escrever nada")
        println("1 - Escrever o KWIC num arquivo de saida")
        println("2 - Escrever o KWIC no terminal")

        option = readLine()!!.toInt()
        while((option != 0) and (option != 1) and (option != 2)){
            println("Opção Inválida")
            option = readLine()!!.toInt()
        }

        when(option){
            1 -> {

                val output = FileOutputManager()
                output.write(kwic_manager.mkKWIC(lines,stop_words))
            }
            2 -> {

                val output = TerminalOutputManager()
                output.write(kwic_manager.mkKWIC(lines,stop_words))
            }
        }

    }

    fun init(){
        var option: Int
        var file_name: String

        do {
            println()
            println("Escolha uma das opções abaixo:")
            println("0 - Para fechar o programa")
            println("1 - Input de linhas a partir de um arquivo texto")
            println("2 - Input de linhas a partir de uma api do DBLP")
            option = readLine()!!.toInt()

            when(option) {
                0 -> {
                    println("Obrigado por usar o sistema...\n\nFINALIZANDO")
                }
                1 -> {

                    println("Digite o nome do arquivo de input .txt")
                    file_name = readLine()!!

                    while(!File(file_name).exists()){
                        println("Arquivo inexistente, tente novamente")
                        file_name = readLine()!!
                    }

                    val input = FileStorageManager()
                    this.outputMenu(input.read(file_name))

                    println("\n\nCONTINUANDO...\n")
                }
                2 -> {

                    println("Digite a query de pesquisa para a API do DBLP")
                    file_name = readLine()!!

                    val input = APIStorageManager()
                    this.outputMenu(input.read(file_name))

                    println("\n\nCONTINUANDO...\n")

                }
                else -> {
                    println("Opcão inválida")
                }
            }

        }while (option != 0)
    }
}