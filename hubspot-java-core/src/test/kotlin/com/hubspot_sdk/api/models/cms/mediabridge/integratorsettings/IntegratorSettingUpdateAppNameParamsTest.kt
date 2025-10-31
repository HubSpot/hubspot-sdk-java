// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingUpdateAppNameParamsTest {

    @Test
    fun create() {
        IntegratorSettingUpdateAppNameParams.builder()
            .appId("appId")
            .updatedAt(0L)
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntegratorSettingUpdateAppNameParams.builder().appId("appId").updatedAt(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IntegratorSettingUpdateAppNameParams.builder()
                .appId("appId")
                .updatedAt(0L)
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.updatedAt()).isEqualTo(0L)
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IntegratorSettingUpdateAppNameParams.builder().appId("appId").updatedAt(0L).build()

        val body = params._body()

        assertThat(body.updatedAt()).isEqualTo(0L)
    }
}
