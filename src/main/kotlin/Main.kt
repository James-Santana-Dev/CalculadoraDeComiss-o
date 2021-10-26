fun main(args: Array<String>) {
    print("Digite o valor das vendas: ")
    var vendas = readLine()!!.toDouble()

    var comissaoA = 30 * 100
    var comissaoB = 20 * 100
    var comissaoC = 10 * 100



    if(vendas > 10000){
        println("O seu valor a ser recebido será ${vendas + comissaoA}")
    }else if(vendas >= 5001 && vendas <= 9999){
        println("O seu valor a ser recebido será ${vendas + comissaoB}")
    }else if(vendas >= 1001 && vendas <= 4999){
        println("O seu valor a ser recebido será ${vendas + comissaoC}")
    }else{
        println("N/D")

    }

}