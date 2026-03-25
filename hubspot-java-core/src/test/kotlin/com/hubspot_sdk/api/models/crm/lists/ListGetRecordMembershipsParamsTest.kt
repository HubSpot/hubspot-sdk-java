// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListGetRecordMembershipsParamsTest {

    @Test
    fun create() {
        ListGetRecordMembershipsParams.builder()
            .objectTypeId("objectTypeId")
            .recordId("recordId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ListGetRecordMembershipsParams.builder()
                .objectTypeId("objectTypeId")
                .recordId("recordId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectTypeId")
        assertThat(params._pathParam(1)).isEqualTo("recordId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
