(ns Ex6)
; compara se dois valores são iguais
; se forem diferentes, exibe o maior
(defn compara-valores [x y]
  (if (= x y)
    (println "Valores entrados iguais")
    (println "Maior valor informado:" (max x y))))

;; testando
(compara-valores 5 5)
(compara-valores 4 5)