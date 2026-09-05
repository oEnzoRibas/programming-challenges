#include <cstdint>
#include "grains.h"

namespace grains {
    uint_fast64_t square(short square) {
        return static_cast<uint_fast64_t>(1) << (square-1);
    }

    uint_fast64_t total() {
        /* sum of pg a1 (q^{n} - 1)  / (q-1)
         * q = 2
         * n in {0,63}
         * a1 = 1
         * q-1 = 1
         *
         * sum = q^{n} - 1
         * = 2{^n} - 1
         */
        return ~static_cast<uint64_t>(0); //2^{64} -1 - 1111.1111 1111.1111 1111.1111 1111.1111 1111.1111 1111.1111 1111.1111 1111.1111

    }
}
