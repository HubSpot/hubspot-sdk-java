// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.groups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupDeleteByNameParamsTest {

    @Test
    fun create() {
        GroupDeleteByNameParams.builder()
            .appId("appId")
            .objectType("objectType")
            .groupName("groupName")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GroupDeleteByNameParams.builder()
                .appId("appId")
                .objectType("objectType")
                .groupName("groupName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        assertThat(params._pathParam(2)).isEqualTo("groupName")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
