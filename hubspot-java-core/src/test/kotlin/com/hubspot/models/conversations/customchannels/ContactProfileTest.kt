// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactProfileTest {

    @Test
    fun create() {
        val contactProfile =
            ContactProfile.builder()
                .addAddress(
                    ContactAddress.builder()
                        .city("city")
                        .country("country")
                        .countryCode("countryCode")
                        .state("state")
                        .street("street")
                        .type(ContactAddress.Type.HOME)
                        .zip("zip")
                        .build()
                )
                .addEmail(
                    ContactEmail.builder().email("email").type(ContactEmail.Type.HOME).build()
                )
                .addPhone(
                    ContactPhone.builder().phone("phone").type(ContactPhone.Type.CELL).build()
                )
                .addUrl(ContactUrl.builder().url("url").type(ContactUrl.Type.HOME).build())
                .name(
                    ContactName.builder()
                        .firstName("firstName")
                        .lastName("lastName")
                        .middleName("middleName")
                        .prefix("prefix")
                        .suffix("suffix")
                        .build()
                )
                .org(
                    ContactOrg.builder()
                        .company("company")
                        .department("department")
                        .title("title")
                        .build()
                )
                .build()

        assertThat(contactProfile.addresses())
            .containsExactly(
                ContactAddress.builder()
                    .city("city")
                    .country("country")
                    .countryCode("countryCode")
                    .state("state")
                    .street("street")
                    .type(ContactAddress.Type.HOME)
                    .zip("zip")
                    .build()
            )
        assertThat(contactProfile.emails())
            .containsExactly(
                ContactEmail.builder().email("email").type(ContactEmail.Type.HOME).build()
            )
        assertThat(contactProfile.phones())
            .containsExactly(
                ContactPhone.builder().phone("phone").type(ContactPhone.Type.CELL).build()
            )
        assertThat(contactProfile.urls())
            .containsExactly(ContactUrl.builder().url("url").type(ContactUrl.Type.HOME).build())
        assertThat(contactProfile.name())
            .contains(
                ContactName.builder()
                    .firstName("firstName")
                    .lastName("lastName")
                    .middleName("middleName")
                    .prefix("prefix")
                    .suffix("suffix")
                    .build()
            )
        assertThat(contactProfile.org())
            .contains(
                ContactOrg.builder()
                    .company("company")
                    .department("department")
                    .title("title")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactProfile =
            ContactProfile.builder()
                .addAddress(
                    ContactAddress.builder()
                        .city("city")
                        .country("country")
                        .countryCode("countryCode")
                        .state("state")
                        .street("street")
                        .type(ContactAddress.Type.HOME)
                        .zip("zip")
                        .build()
                )
                .addEmail(
                    ContactEmail.builder().email("email").type(ContactEmail.Type.HOME).build()
                )
                .addPhone(
                    ContactPhone.builder().phone("phone").type(ContactPhone.Type.CELL).build()
                )
                .addUrl(ContactUrl.builder().url("url").type(ContactUrl.Type.HOME).build())
                .name(
                    ContactName.builder()
                        .firstName("firstName")
                        .lastName("lastName")
                        .middleName("middleName")
                        .prefix("prefix")
                        .suffix("suffix")
                        .build()
                )
                .org(
                    ContactOrg.builder()
                        .company("company")
                        .department("department")
                        .title("title")
                        .build()
                )
                .build()

        val roundtrippedContactProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactProfile),
                jacksonTypeRef<ContactProfile>(),
            )

        assertThat(roundtrippedContactProfile).isEqualTo(contactProfile)
    }
}
