(ns Ex8)

(defn situacao-aluno [nome media]
  (println "Nome do aluno:" nome)
  (println "Media Final:" media)
  (if (>= media 6)
    (println "Situacao: Aprovado")
    (println "Situacao: Reprovado")))

;; testando
(situacao-aluno "Paulo" 8.9)
(situacao-aluno "Ana" 9.5)
