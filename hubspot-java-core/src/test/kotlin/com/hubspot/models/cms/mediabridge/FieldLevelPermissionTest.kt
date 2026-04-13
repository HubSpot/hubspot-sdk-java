// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FieldLevelPermissionTest {

    @Test
    fun create() {
        val fieldLevelPermission = FieldLevelPermission.builder().accessLevel("accessLevel").build()

        assertThat(fieldLevelPermission.accessLevel()).isEqualTo("accessLevel")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fieldLevelPermission = FieldLevelPermission.builder().accessLevel("accessLevel").build()

        val roundtrippedFieldLevelPermission =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fieldLevelPermission),
                jacksonTypeRef<FieldLevelPermission>(),
            )

        assertThat(roundtrippedFieldLevelPermission).isEqualTo(fieldLevelPermission)
    }
}
