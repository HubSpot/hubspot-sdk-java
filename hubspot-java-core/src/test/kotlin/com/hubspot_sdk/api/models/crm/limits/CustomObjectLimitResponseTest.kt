// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomObjectLimitResponseTest {

    @Test
    fun create() {
        val customObjectLimitResponse =
            CustomObjectLimitResponse.builder().limit(0L).percentage(0.0).usage(0L).build()

        assertThat(customObjectLimitResponse.limit()).isEqualTo(0L)
        assertThat(customObjectLimitResponse.percentage()).isEqualTo(0.0)
        assertThat(customObjectLimitResponse.usage()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customObjectLimitResponse =
            CustomObjectLimitResponse.builder().limit(0L).percentage(0.0).usage(0L).build()

        val roundtrippedCustomObjectLimitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customObjectLimitResponse),
                jacksonTypeRef<CustomObjectLimitResponse>(),
            )

        assertThat(roundtrippedCustomObjectLimitResponse).isEqualTo(customObjectLimitResponse)
    }
}
