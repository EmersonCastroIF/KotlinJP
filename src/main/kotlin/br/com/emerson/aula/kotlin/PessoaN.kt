package br.com.emerson.aula.kotlin

open class PessoaN(val nome: String, val peso: Float, val altura: Float) {
    val imc get() = peso / (altura * altura)
}