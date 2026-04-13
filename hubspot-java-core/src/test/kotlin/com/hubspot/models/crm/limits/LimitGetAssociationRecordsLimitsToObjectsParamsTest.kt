// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.limits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LimitGetAssociationRecordsLimitsToObjectsParamsTest {

    @Test
    fun create() {
        LimitGetAssociationRecordsLimitsToObjectsParams.builder()
            .fromObjectTypeId("fromObjectTypeId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LimitGetAssociationRecordsLimitsToObjectsParams.builder()
                .fromObjectTypeId("fromObjectTypeId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fromObjectTypeId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
