(ns Ex10)

(defn situacao-completa [nome nota1 nota2]
  (let [media (/ (+ nota1 nota2) 2.0)]
    (println "Nome do aluno:" nome)
    (println "Notas informadas:" nota1 "e" nota2)
    (println "Media calculada:" media)
    (cond
      (>= media 7.0) (println "Situacao final: Aprovado")
      (>= media 5.0) (println "Situacao final: Recuperacao")
      :else          (println "Situacao final: Reprovado"))))

;; testando
(situacao-completa "João" 8.0 6.5)
(situacao-completa "Maria" 5.0 5.5)
(situacao-completa "Pedro" 3.5 4.0)
