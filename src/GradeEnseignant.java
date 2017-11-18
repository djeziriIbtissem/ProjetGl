public enum GradeEnseignant {

    PR {
        @Override
        public String toString() {
            return "Professeur";
        }
    },

    MCA {
        @Override
        public String toString() {
            return "Maitre de conference A";
        }
    },
    MCB {
        @Override
        public String toString() {
            return "Maitre de conference B";
        }
    },
    MAA {
        @Override
        public String toString() {
            return "Maitre assistant A";
        }
    },
    MAB {
        @Override
        public String toString() {
            return "Maitre assistant B";
        }
    }
}
