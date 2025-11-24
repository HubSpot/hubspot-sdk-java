// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicContactTest {

    @Test
    fun create() {
        val publicContact =
            PublicContact.builder()
                .contactProfile(
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
                            ContactEmail.builder()
                                .email("email")
                                .type(ContactEmail.Type.HOME)
                                .build()
                        )
                        .addPhone(
                            ContactPhone.builder()
                                .phone("phone")
                                .type(ContactPhone.Type.CELL)
                                .build()
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
                )
                .type(PublicContact.Type.CONTACT)
                .build()

        assertThat(publicContact.contactProfile())
            .isEqualTo(
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
            )
        assertThat(publicContact.type()).isEqualTo(PublicContact.Type.CONTACT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicContact =
            PublicContact.builder()
                .contactProfile(
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
                            ContactEmail.builder()
                                .email("email")
                                .type(ContactEmail.Type.HOME)
                                .build()
                        )
                        .addPhone(
                            ContactPhone.builder()
                                .phone("phone")
                                .type(ContactPhone.Type.CELL)
                                .build()
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
                )
                .type(PublicContact.Type.CONTACT)
                .build()

        val roundtrippedPublicContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicContact),
                jacksonTypeRef<PublicContact>(),
            )

        assertThat(roundtrippedPublicContact).isEqualTo(publicContact)
    }
}
