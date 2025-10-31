// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingRegisterAppNameResponseTest {

    @Test
    fun create() {
        val integratorSettingRegisterAppNameResponse =
            IntegratorSettingRegisterAppNameResponse.builder().appId(0).name("name").build()

        assertThat(integratorSettingRegisterAppNameResponse.appId()).isEqualTo(0)
        assertThat(integratorSettingRegisterAppNameResponse.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorSettingRegisterAppNameResponse =
            IntegratorSettingRegisterAppNameResponse.builder().appId(0).name("name").build()

        val roundtrippedIntegratorSettingRegisterAppNameResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorSettingRegisterAppNameResponse),
                jacksonTypeRef<IntegratorSettingRegisterAppNameResponse>(),
            )

        assertThat(roundtrippedIntegratorSettingRegisterAppNameResponse)
            .isEqualTo(integratorSettingRegisterAppNameResponse)
    }
}
