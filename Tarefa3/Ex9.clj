(ns Ex9)

(defn operacoes-com-checagem [a b]
  (let [soma (+ a b)
        multiplicacao (* a b)]
    (println "Soma:" soma)
    (println "Multiplicação:" multiplicacao)
    (if (> soma 20)
      (println "O valor da soma é maior que 20.")
      (println "O valor da soma não é maior que 20."))))

;; testando
(operacoes-com-checagem 7 13)
(operacoes-com-checagem 8 20)

