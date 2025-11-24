// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailSettingsResponseTest {

    @Test
    fun create() {
        val emailSettingsResponse =
            EmailSettingsResponse.builder()
                .criteria(EmailSettingsResponse.Criteria.ALL)
                .sellingStrategy(EmailSettingsResponse.SellingStrategy.ACCOUNT_BASED)
                .build()

        assertThat(emailSettingsResponse.criteria()).isEqualTo(EmailSettingsResponse.Criteria.ALL)
        assertThat(emailSettingsResponse.sellingStrategy())
            .isEqualTo(EmailSettingsResponse.SellingStrategy.ACCOUNT_BASED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailSettingsResponse =
            EmailSettingsResponse.builder()
                .criteria(EmailSettingsResponse.Criteria.ALL)
                .sellingStrategy(EmailSettingsResponse.SellingStrategy.ACCOUNT_BASED)
                .build()

        val roundtrippedEmailSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailSettingsResponse),
                jacksonTypeRef<EmailSettingsResponse>(),
            )

        assertThat(roundtrippedEmailSettingsResponse).isEqualTo(emailSettingsResponse)
    }
}
