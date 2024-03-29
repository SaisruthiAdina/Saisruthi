       01 MY-RECORD.
              05 CLAIM-NUMBER             PIC X(19).
              05 ADMISSION-DATE           PACKED-DECIMAL PIC S9(7).
              05 FROM-DATE                PACKED-DECIMAL PIC S9(7).
              05 THRU-DATE                PACKED-DECIMAL PIC S9(7).
              05 DISCHARGE-DATE           PACKED-DECIMAL PIC S9(7).
              05 FULL-DAYS                PACKED-DECIMAL PIC S9(5).
              05 COINSURANCE-DAYS         BINARY         PIC 9(4).
              05 LIFETIME-RES-DAYS        BINARY         PIC 9(6).
              05 INTERMEDIARY-NUM         BINARY         PIC 9(10).
              05 PROVIDER                                PIC X(13).
              05 INPATIENT-DED            PACKED-DECIMAL PIC S9(4)V99.
              05 BLOOD-DED                PACKED-DECIMAL PIC S9(4)V99.
              05 TOTAL-CHARGES      PIC S9(7)V99 DISPLAY SIGN LEADING.
              05 PATIENT-STATUS                          PIC X(2).
              05 BLOOD-PINTS-FURNISHED    BINARY         PIC 9(5).
              05 BLOOD-PINTS-REPLACED     BINARY         PIC 9(4).
              05 SEQUENCE-COUNTER         BINARY         PIC 9(3).
              05 TRANSACTION-IND                         PIC 9.
              05 BILL-SOURCE                             PIC 9.
              05 BENEFITS-EXHAUST-IND                    PIC 9.
              05 BENEFITS-PAY-IND                        PIC 9.
              05 AUTO-ADJUSTMENT-IND                     PIC X.
              05 INTERMEDIARY-CTRL-NUM                   PIC X(23).