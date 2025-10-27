// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties.groups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupGetParamsTest {

    @Test
    fun create() {
        GroupGetParams.builder().objectType("objectType").groupName("groupName").build()
    }

    @Test
    fun pathParams() {
        val params =
            GroupGetParams.builder().objectType("objectType").groupName("groupName").build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("groupName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
