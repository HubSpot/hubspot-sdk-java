// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListScheduleConversionParamsTest {

    @Test
    fun create() {
        ListScheduleConversionParams.builder().listId("listId").build()
    }

    @Test
    fun pathParams() {
        val params = ListScheduleConversionParams.builder().listId("listId").build()

        assertThat(params._pathParam(0)).isEqualTo("listId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
