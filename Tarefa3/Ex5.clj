(ns Ex5)
;; verifica se dois números são iguais
(defn sao-iguais [x y]
  (if (= x y)
    (println "Valores iguais")
    (println "Valores diferentes")))

;; testando
(sao-iguais 5 5)
(sao-iguais 4 5)