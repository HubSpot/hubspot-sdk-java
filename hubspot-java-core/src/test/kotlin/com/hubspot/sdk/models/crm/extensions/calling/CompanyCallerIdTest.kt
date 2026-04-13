// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyCallerIdTest {

    @Test
    fun create() {
        val companyCallerId =
            CompanyCallerId.builder()
                .callerIdType(CompanyCallerId.CallerIdType.COMPANY)
                .objectCoordinates(
                    ObjectCoordinates.builder()
                        .objectId(0)
                        .objectTypeId("objectTypeId")
                        .portalId(0)
                        .build()
                )
                .name("name")
                .build()

        assertThat(companyCallerId.callerIdType()).isEqualTo(CompanyCallerId.CallerIdType.COMPANY)
        assertThat(companyCallerId.objectCoordinates())
            .isEqualTo(
                ObjectCoordinates.builder()
                    .objectId(0)
                    .objectTypeId("objectTypeId")
                    .portalId(0)
                    .build()
            )
        assertThat(companyCallerId.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyCallerId =
            CompanyCallerId.builder()
                .callerIdType(CompanyCallerId.CallerIdType.COMPANY)
                .objectCoordinates(
                    ObjectCoordinates.builder()
                        .objectId(0)
                        .objectTypeId("objectTypeId")
                        .portalId(0)
                        .build()
                )
                .name("name")
                .build()

        val roundtrippedCompanyCallerId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyCallerId),
                jacksonTypeRef<CompanyCallerId>(),
            )

        assertThat(roundtrippedCompanyCallerId).isEqualTo(companyCallerId)
    }
}
