(ns Ex3)

;; ENUNCIADO
; média ponderada

(defn aprovado_ponderada [nota1, nota2, nota3]
  (println "Nota 1: " nota1)
  (println "Nota 2: " nota2)
  (println "Nota 3: " nota3)

  (let [media (/ (+ (* nota1 2) (* nota2 3) (* nota3 4)) 9.0)]
    (println "Média: " media)
    (if (>= media 5)
      (println "Aprovado")
      (println "Reprovado"))))

; testando valores
(aprovado_ponderada 8.7 5.5 9.5)
(aprovado_ponderada 9.2, 7.8 5.9)