// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.CreatedResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicGdprDeleteInput
import com.hubspot_sdk.api.models.crm.PublicMergeInput
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactCreateParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactDeleteParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactGdprDeleteParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactGetParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactListPage
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactListParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactMergeParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactSearchParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.contacts.BatchService
import java.util.function.Consumer

interface ContactService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService

    fun batch(): BatchService

    /**
     * Create a single contact. Include a `properties` object to define
     * [property values](https://developers.hubspot.com/docs/guides/api/crm/properties) for the
     * contact, along with an `associations` array to define
     * [associations](https://developers.hubspot.com/docs/guides/api/crm/associations/associations-v4)
     * with other CRM records.
     */
    fun create(params: ContactCreateParams): CreatedResponseSimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseSimplePublicObject =
        create(
            ContactCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CreatedResponseSimplePublicObject =
        create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Update an existing contact, identified by ID or email/unique property value. To identify a
     * contact by ID, include the ID in the request URL path. To identify a contact by their email
     * or other unique property, include the email/property value in the request URL path, and add
     * the `idProperty` query parameter
     * (`/crm/v3/objects/contacts/jon@website.com?idProperty=email`). Provided property values will
     * be overwritten. Read-only and non-existent properties will result in an error. Properties
     * values can be cleared by passing an empty string.
     */
    fun update(contactId: String, params: ContactUpdateParams): SimplePublicObject =
        update(contactId, params, RequestOptions.none())

    /** @see update */
    fun update(
        contactId: String,
        params: ContactUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see update */
    fun update(params: ContactUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContactUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Retrieve all contacts, using query parameters to specify the information that gets returned.
     */
    fun list(): ContactListPage = list(ContactListParams.none())

    /** @see list */
    fun list(
        params: ContactListParams = ContactListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactListPage

    /** @see list */
    fun list(params: ContactListParams = ContactListParams.none()): ContactListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ContactListPage =
        list(ContactListParams.none(), requestOptions)

    /**
     * Delete a contact by ID. Deleted contacts can be restored within 90 days of deletion. Learn
     * more about the
     * [data impacted by contact deletions](https://knowledge.hubspot.com/privacy-and-consent/understand-restorable-and-permanent-contact-deletions)
     * and how to
     * [restore archived records](https://knowledge.hubspot.com/records/restore-deleted-records).
     */
    fun delete(contactId: String) = delete(contactId, ContactDeleteParams.none())

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see delete */
    fun delete(contactId: String, params: ContactDeleteParams = ContactDeleteParams.none()) =
        delete(contactId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ContactDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ContactDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(contactId: String, requestOptions: RequestOptions) =
        delete(contactId, ContactDeleteParams.none(), requestOptions)

    /**
     * Permanently delete a contact and all associated content to follow GDPR. Use optional property
     * `idProperty` set to `email` to identify contact by email address. If email address is not
     * found, the email address will be added to a blocklist and prevent it from being used in the
     * future. Learn more about
     * [permanently deleting contacts](https://knowledge.hubspot.com/privacy-and-consent/how-do-i-perform-a-gdpr-delete-in-hubspot).
     */
    fun gdprDelete(params: ContactGdprDeleteParams) = gdprDelete(params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(
        params: ContactGdprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see gdprDelete */
    fun gdprDelete(
        publicGdprDeleteInput: PublicGdprDeleteInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        gdprDelete(
            ContactGdprDeleteParams.builder().publicGdprDeleteInput(publicGdprDeleteInput).build(),
            requestOptions,
        )

    /** @see gdprDelete */
    fun gdprDelete(publicGdprDeleteInput: PublicGdprDeleteInput) =
        gdprDelete(publicGdprDeleteInput, RequestOptions.none())

    /**
     * Retrieve a contact by its ID (`contactId`) or by a unique property (`idProperty`). You can
     * specify what is returned using the `properties` query parameter.
     */
    fun get(contactId: String): SimplePublicObjectWithAssociations =
        get(contactId, ContactGetParams.none())

    /** @see get */
    fun get(
        contactId: String,
        params: ContactGetParams = ContactGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see get */
    fun get(
        contactId: String,
        params: ContactGetParams = ContactGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(contactId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ContactGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: ContactGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(contactId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(contactId, ContactGetParams.none(), requestOptions)

    /**
     * Merge two contact records. Learn more about
     * [merging records](https://knowledge.hubspot.com/records/merge-records).
     */
    fun merge(params: ContactMergeParams): SimplePublicObject = merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: ContactMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see merge */
    fun merge(
        publicMergeInput: PublicMergeInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        merge(
            ContactMergeParams.builder().publicMergeInput(publicMergeInput).build(),
            requestOptions,
        )

    /** @see merge */
    fun merge(publicMergeInput: PublicMergeInput): SimplePublicObject =
        merge(publicMergeInput, RequestOptions.none())

    /**
     * Search for contacts by filtering on properties, searching through associations, and sorting
     * results. Learn more about
     * [CRM search](https://developers.hubspot.com/docs/guides/api/crm/search#make-a-search-request).
     */
    fun search(params: ContactSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ContactSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            ContactSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [ContactService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/contacts`, but is otherwise the
         * same as [ContactService.create].
         */
        @MustBeClosed
        fun create(
            params: ContactCreateParams
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(
                ContactCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<CreatedResponseSimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/v3/objects/contacts/{contactId}`, but is
         * otherwise the same as [ContactService.update].
         */
        @MustBeClosed
        fun update(
            contactId: String,
            params: ContactUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(contactId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            contactId: String,
            params: ContactUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ContactUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ContactUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/contacts`, but is otherwise the same
         * as [ContactService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ContactListPage> = list(ContactListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContactListParams = ContactListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContactListParams = ContactListParams.none()
        ): HttpResponseFor<ContactListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ContactListPage> =
            list(ContactListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/objects/contacts/{contactId}`, but is
         * otherwise the same as [ContactService.delete].
         */
        @MustBeClosed
        fun delete(contactId: String): HttpResponse = delete(contactId, ContactDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
        ): HttpResponse = delete(contactId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ContactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ContactDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(contactId: String, requestOptions: RequestOptions): HttpResponse =
            delete(contactId, ContactDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/contacts/gdpr-delete`, but is
         * otherwise the same as [ContactService.gdprDelete].
         */
        @MustBeClosed
        fun gdprDelete(params: ContactGdprDeleteParams): HttpResponse =
            gdprDelete(params, RequestOptions.none())

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            params: ContactGdprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            publicGdprDeleteInput: PublicGdprDeleteInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            gdprDelete(
                ContactGdprDeleteParams.builder()
                    .publicGdprDeleteInput(publicGdprDeleteInput)
                    .build(),
                requestOptions,
            )

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(publicGdprDeleteInput: PublicGdprDeleteInput): HttpResponse =
            gdprDelete(publicGdprDeleteInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /crm/v3/objects/contacts/{contactId}`, but is
         * otherwise the same as [ContactService.get].
         */
        @MustBeClosed
        fun get(contactId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(contactId, ContactGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            contactId: String,
            params: ContactGetParams = ContactGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            contactId: String,
            params: ContactGetParams = ContactGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(contactId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ContactGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: ContactGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            contactId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(contactId, ContactGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/contacts/merge`, but is otherwise
         * the same as [ContactService.merge].
         */
        @MustBeClosed
        fun merge(params: ContactMergeParams): HttpResponseFor<SimplePublicObject> =
            merge(params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            params: ContactMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see merge */
        @MustBeClosed
        fun merge(
            publicMergeInput: PublicMergeInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            merge(
                ContactMergeParams.builder().publicMergeInput(publicMergeInput).build(),
                requestOptions,
            )

        /** @see merge */
        @MustBeClosed
        fun merge(publicMergeInput: PublicMergeInput): HttpResponseFor<SimplePublicObject> =
            merge(publicMergeInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/v3/objects/contacts/search`, but is otherwise
         * the same as [ContactService.search].
         */
        @MustBeClosed
        fun search(
            params: ContactSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: ContactSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                ContactSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
