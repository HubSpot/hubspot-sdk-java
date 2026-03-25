// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContactAttachmentTest {

    @Test
    fun create() {
        val contactAttachment =
            ContactAttachment.builder()
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
                .type(ContactAttachment.Type.CONTACT)
                .build()

        assertThat(contactAttachment.contactProfile())
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
        assertThat(contactAttachment.type()).isEqualTo(ContactAttachment.Type.CONTACT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactAttachment =
            ContactAttachment.builder()
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
                .type(ContactAttachment.Type.CONTACT)
                .build()

        val roundtrippedContactAttachment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactAttachment),
                jacksonTypeRef<ContactAttachment>(),
            )

        assertThat(roundtrippedContactAttachment).isEqualTo(contactAttachment)
    }
}
