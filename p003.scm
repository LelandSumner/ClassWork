
(define (in-range? x low high)
(if((and 
    (or (= x low) (> x low))
    (< x high))) #f))
        
