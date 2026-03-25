// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComplianceIdsTest {

    @Test
    fun create() {
        val complianceIds =
            ComplianceIds.builder()
                .addContactId(ContactId.builder().portalId(0).email("email").vid(0L).build())
                .addPortalId(0)
                .addUserId(0)
                .noContactIdReason("noContactIdReason")
                .noPortalIdReason("noPortalIdReason")
                .noUserIdReason("noUserIdReason")
                .build()

        assertThat(complianceIds.contactIds())
            .containsExactly(ContactId.builder().portalId(0).email("email").vid(0L).build())
        assertThat(complianceIds.portalIds()).containsExactly(0)
        assertThat(complianceIds.userIds()).containsExactly(0)
        assertThat(complianceIds.noContactIdReason()).contains("noContactIdReason")
        assertThat(complianceIds.noPortalIdReason()).contains("noPortalIdReason")
        assertThat(complianceIds.noUserIdReason()).contains("noUserIdReason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val complianceIds =
            ComplianceIds.builder()
                .addContactId(ContactId.builder().portalId(0).email("email").vid(0L).build())
                .addPortalId(0)
                .addUserId(0)
                .noContactIdReason("noContactIdReason")
                .noPortalIdReason("noPortalIdReason")
                .noUserIdReason("noUserIdReason")
                .build()

        val roundtrippedComplianceIds =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(complianceIds),
                jacksonTypeRef<ComplianceIds>(),
            )

        assertThat(roundtrippedComplianceIds).isEqualTo(complianceIds)
    }
}
