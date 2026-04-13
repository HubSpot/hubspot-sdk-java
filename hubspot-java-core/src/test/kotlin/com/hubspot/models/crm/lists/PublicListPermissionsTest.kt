// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicListPermissionsTest {

    @Test
    fun create() {
        val publicListPermissions =
            PublicListPermissions.builder()
                .addTeamsWithEditAccess(0)
                .addUsersWithEditAccess(0)
                .build()

        assertThat(publicListPermissions.teamsWithEditAccess()).containsExactly(0)
        assertThat(publicListPermissions.usersWithEditAccess()).containsExactly(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicListPermissions =
            PublicListPermissions.builder()
                .addTeamsWithEditAccess(0)
                .addUsersWithEditAccess(0)
                .build()

        val roundtrippedPublicListPermissions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicListPermissions),
                jacksonTypeRef<PublicListPermissions>(),
            )

        assertThat(roundtrippedPublicListPermissions).isEqualTo(publicListPermissions)
    }
}
