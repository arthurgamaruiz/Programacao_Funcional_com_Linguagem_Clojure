(ns Ex5)

(defn sao-iguais [x y]
  (if (= x y)
    (println "Valores iguais")
    (println "Valores diferentes")))

;; testando
(sao-iguais 5 5)
(sao-iguais 3 7)