import java.io.File

//  TRABALHO DE TP2 - UNB
//  SISTEMA MODULARIZADO DE UM KWIC
//
//  CODERS: LUCAS DA SILVA MOUTINHO - 15/0015747 - lucasmoutinho
//          NICHOLAS NISHIMOTO MARQUES - 15/0019343 - nicknish09

fun outputMenu(lines: List<String>){
    var option: Int

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
            output.write(lines)
        }
        2 -> {

            val output = TerminalOutputManager()
            output.write(lines)
        }
    }

}

fun main(args: Array<String>) {
    var option: Int

    println("***************************************")
    println("---------- BEM VINDO AO KWIC ----------")
    println("***************************************")

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
                var file_name = readLine()!!

                while(!File(file_name).exists()){
                    println("Arquivo inexistente, tente novamente")
                    var file_name = readLine()!!
                }

                val input = FileStorageManager()
                outputMenu(input.read(file_name))

                println("Pressione enter para continuar...")
                readLine()
            }
            2 -> {

                println("Digite a query de pesquisa para a API do DBLP")
                var file_name = readLine()!!

                val input = APIStorageManager()
                outputMenu(input.read(file_name))

                println("Pressione enter para continuar...")
                readLine()

            }
            else -> {
                println("Opcão inválida")
            }
        }

    }while (option != 0)
}