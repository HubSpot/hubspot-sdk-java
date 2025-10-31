// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objectlibrary.enablement

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnablementListResponseTest {

    @Test
    fun create() {
        val enablementListResponse =
            EnablementListResponse.builder()
                .enablementByObjectTypeId(
                    EnablementListResponse.EnablementByObjectTypeId.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        assertThat(enablementListResponse.enablementByObjectTypeId())
            .isEqualTo(
                EnablementListResponse.EnablementByObjectTypeId.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enablementListResponse =
            EnablementListResponse.builder()
                .enablementByObjectTypeId(
                    EnablementListResponse.EnablementByObjectTypeId.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val roundtrippedEnablementListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(enablementListResponse),
                jacksonTypeRef<EnablementListResponse>(),
            )

        assertThat(roundtrippedEnablementListResponse).isEqualTo(enablementListResponse)
    }
}
