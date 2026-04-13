// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.limits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LimitGetAssociationRecordsLimitsByObjectTypeParamsTest {

    @Test
    fun create() {
        LimitGetAssociationRecordsLimitsByObjectTypeParams.builder()
            .fromObjectTypeId("fromObjectTypeId")
            .toObjectTypeId("toObjectTypeId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LimitGetAssociationRecordsLimitsByObjectTypeParams.builder()
                .fromObjectTypeId("fromObjectTypeId")
                .toObjectTypeId("toObjectTypeId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fromObjectTypeId")
        assertThat(params._pathParam(1)).isEqualTo("toObjectTypeId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
