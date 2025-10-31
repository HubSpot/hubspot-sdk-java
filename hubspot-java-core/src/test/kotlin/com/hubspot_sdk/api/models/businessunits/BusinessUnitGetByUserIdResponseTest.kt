// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.businessunits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.marketing.campaigns.PublicBusinessUnit
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessUnitGetByUserIdResponseTest {

    @Test
    fun create() {
        val businessUnitGetByUserIdResponse =
            BusinessUnitGetByUserIdResponse.builder()
                .addResult(PublicBusinessUnit.builder().id(0).build())
                .build()

        assertThat(businessUnitGetByUserIdResponse.results())
            .containsExactly(PublicBusinessUnit.builder().id(0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessUnitGetByUserIdResponse =
            BusinessUnitGetByUserIdResponse.builder()
                .addResult(PublicBusinessUnit.builder().id(0).build())
                .build()

        val roundtrippedBusinessUnitGetByUserIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessUnitGetByUserIdResponse),
                jacksonTypeRef<BusinessUnitGetByUserIdResponse>(),
            )

        assertThat(roundtrippedBusinessUnitGetByUserIdResponse)
            .isEqualTo(businessUnitGetByUserIdResponse)
    }
}
