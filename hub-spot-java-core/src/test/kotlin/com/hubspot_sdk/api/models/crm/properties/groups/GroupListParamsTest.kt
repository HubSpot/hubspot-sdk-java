// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties.groups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupListParamsTest {

    @Test
    fun create() {
        GroupListParams.builder().objectType("objectType").build()
    }

    @Test
    fun pathParams() {
        val params = GroupListParams.builder().objectType("objectType").build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
