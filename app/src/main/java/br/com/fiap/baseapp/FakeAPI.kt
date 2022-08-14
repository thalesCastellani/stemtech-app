package br.com.fiap.baseapp

class FakeAPI {

    fun getEstados(): Array<String> {
        return arrayOf(
            "São Paulo",
            "Rio de Janeiro",
            "Bahia",
            "Minas Gerais"
        )
    }

}