// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objectlibrary.enablement

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnablementGetResponseTest {

    @Test
    fun create() {
        val enablementGetResponse = EnablementGetResponse.builder().enablement(true).build()

        assertThat(enablementGetResponse.enablement()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enablementGetResponse = EnablementGetResponse.builder().enablement(true).build()

        val roundtrippedEnablementGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enablementGetResponse),
                jacksonTypeRef<EnablementGetResponse>(),
            )

        assertThat(roundtrippedEnablementGetResponse).isEqualTo(enablementGetResponse)
    }
}
