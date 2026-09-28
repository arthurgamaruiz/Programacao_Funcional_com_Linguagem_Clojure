;; ENUNCIADO
; função que recebe um número inteiro e verifica se ele é maior que 10
(ns Ex1)
(defn nome [valor] 
  (if (> valor 10)
    (println "Valor maior que 10")
    (println "Valor não é maior que 10"))
  )

(nome 2)
(nome 10)
(nome 13)