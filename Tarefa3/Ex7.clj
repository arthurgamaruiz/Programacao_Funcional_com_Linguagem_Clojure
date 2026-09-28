(ns Ex7)
; função para verificar se uma pessoa pode doar sangue
; baseado na idade 
(defn pode-doar-sangue [idade]
  (if (and (>= idade 18) (<= idade 67))
    "Pode doar"
    "Não pode doar"))

;; testando
(println "14 anos:" (pode-doar-sangue 14))
(println "17 anos:" (pode-doar-sangue 17))
(println "67 anos:" (pode-doar-sangue 67))
(println "72 anos:" (pode-doar-sangue 72))