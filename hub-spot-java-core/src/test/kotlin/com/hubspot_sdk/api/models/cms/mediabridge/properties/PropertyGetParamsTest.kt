// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.properties

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyGetParamsTest {

    @Test
    fun create() {
        PropertyGetParams.builder()
            .appId("appId")
            .objectType("objectType")
            .propertyName("propertyName")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PropertyGetParams.builder()
                .appId("appId")
                .objectType("objectType")
                .propertyName("propertyName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        assertThat(params._pathParam(2)).isEqualTo("propertyName")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
