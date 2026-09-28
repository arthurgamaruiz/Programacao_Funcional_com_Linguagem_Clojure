(ns Ex2)
;; ENUNCIADO
; função que calcula a média de três notas, exibe-as e verifica se o aluno
; foi aprovado

(defn aprovado [nota1, nota2, nota3]
  (println "Nota 1: "nota1)
  (println "Nota 2: " nota2)
  (println "Nota 3: " nota3)

  (let [media (/ (+ nota1 nota2 nota3) 3.0)]
    (println "Média: "media)
    (if (>= media 6)
      (println "Aprovado")
      (println "Reprovado")
      )
    )
  )

; testando valores
(aprovado 8.7 5.5 9.5)
(aprovado 9.2, 7.8 5.9)