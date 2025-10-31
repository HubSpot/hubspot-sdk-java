// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingUpdateAppNameResponseTest {

    @Test
    fun create() {
        val integratorSettingUpdateAppNameResponse =
            IntegratorSettingUpdateAppNameResponse.builder().appId(0).name("name").build()

        assertThat(integratorSettingUpdateAppNameResponse.appId()).isEqualTo(0)
        assertThat(integratorSettingUpdateAppNameResponse.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integratorSettingUpdateAppNameResponse =
            IntegratorSettingUpdateAppNameResponse.builder().appId(0).name("name").build()

        val roundtrippedIntegratorSettingUpdateAppNameResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integratorSettingUpdateAppNameResponse),
                jacksonTypeRef<IntegratorSettingUpdateAppNameResponse>(),
            )

        assertThat(roundtrippedIntegratorSettingUpdateAppNameResponse)
            .isEqualTo(integratorSettingUpdateAppNameResponse)
    }
}
