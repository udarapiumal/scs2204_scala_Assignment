object Main extends App{
    def Cp(NoBooks:Int):Double=24.95*NoBooks-24.95*NoBooks*0.4
    def Sp(NoBooks:Int):Double=if (NoBooks <=50) {3*NoBooks} else {3*50+(NoBooks-50)*0.75}
    println("WholeSale Cost is->" +Cp(60)+Sp(60))
}