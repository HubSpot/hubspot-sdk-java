// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicMergeInput
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactCreateParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactDeleteParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactGdprDeleteParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactGetParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactListPageAsync
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactListParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactMergeParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactSearchParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactUpdateParams
import com.hubspot_sdk.api.models.crm.objects.contacts.PublicGdprDeleteInput
import com.hubspot_sdk.api.services.async.crm.objects.contacts.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ContactServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactServiceAsync

    fun batch(): BatchServiceAsync

    /** Create a contact */
    fun create(params: ContactCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            ContactCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): CompletableFuture<SimplePublicObject> =
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
    fun update(
        contactId: String,
        params: ContactUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(contactId, params, RequestOptions.none())

    /** @see update */
    fun update(
        contactId: String,
        params: ContactUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see update */
    fun update(params: ContactUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContactUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    fun list(): CompletableFuture<ContactListPageAsync> = list(ContactListParams.none())

    /** @see list */
    fun list(
        params: ContactListParams = ContactListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactListPageAsync>

    /** @see list */
    fun list(
        params: ContactListParams = ContactListParams.none()
    ): CompletableFuture<ContactListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ContactListPageAsync> =
        list(ContactListParams.none(), requestOptions)

    /**
     * Delete a contact by ID. Deleted contacts can be restored within 90 days of deletion. Learn
     * more about the
     * [data impacted by contact deletions](https://knowledge.hubspot.com/privacy-and-consent/understand-restorable-and-permanent-contact-deletions)
     * and how to
     * [restore archived records](https://knowledge.hubspot.com/records/restore-deleted-records).
     */
    fun delete(contactId: String): CompletableFuture<Void?> =
        delete(contactId, ContactDeleteParams.none())

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see delete */
    fun delete(
        contactId: String,
        params: ContactDeleteParams = ContactDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(contactId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ContactDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ContactDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(contactId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(contactId, ContactDeleteParams.none(), requestOptions)

    fun gdprDelete(params: ContactGdprDeleteParams): CompletableFuture<Void?> =
        gdprDelete(params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(
        params: ContactGdprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see gdprDelete */
    fun gdprDelete(
        publicGdprDeleteInput: PublicGdprDeleteInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        gdprDelete(
            ContactGdprDeleteParams.builder().publicGdprDeleteInput(publicGdprDeleteInput).build(),
            requestOptions,
        )

    /** @see gdprDelete */
    fun gdprDelete(publicGdprDeleteInput: PublicGdprDeleteInput): CompletableFuture<Void?> =
        gdprDelete(publicGdprDeleteInput, RequestOptions.none())

    fun get(contactId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(contactId, ContactGetParams.none())

    /** @see get */
    fun get(
        contactId: String,
        params: ContactGetParams = ContactGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().contactId(contactId).build(), requestOptions)

    /** @see get */
    fun get(
        contactId: String,
        params: ContactGetParams = ContactGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(contactId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ContactGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: ContactGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        contactId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(contactId, ContactGetParams.none(), requestOptions)

    /** Merge two contacts */
    fun merge(params: ContactMergeParams): CompletableFuture<SimplePublicObject> =
        merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: ContactMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see merge */
    fun merge(
        publicMergeInput: PublicMergeInput,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        merge(
            ContactMergeParams.builder().publicMergeInput(publicMergeInput).build(),
            requestOptions,
        )

    /** @see merge */
    fun merge(publicMergeInput: PublicMergeInput): CompletableFuture<SimplePublicObject> =
        merge(publicMergeInput, RequestOptions.none())

    /**
     * Search for contacts by filtering on properties, searching through associations, and sorting
     * results. Learn more about
     * [CRM search](https://developers.hubspot.com/docs/guides/api/crm/search#make-a-search-request).
     */
    fun search(
        params: ContactSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ContactSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            ContactSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [ContactServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ContactServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/contacts`, but is otherwise
         * the same as [ContactServiceAsync.create].
         */
        fun create(
            params: ContactCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                ContactCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/contacts/{contactId}`, but is
         * otherwise the same as [ContactServiceAsync.update].
         */
        fun update(
            contactId: String,
            params: ContactUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(contactId, params, RequestOptions.none())

        /** @see update */
        fun update(
            contactId: String,
            params: ContactUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ContactUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ContactUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/contacts`, but is otherwise the
         * same as [ContactServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(ContactListParams.none())

        /** @see list */
        fun list(
            params: ContactListParams = ContactListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>>

        /** @see list */
        fun list(
            params: ContactListParams = ContactListParams.none()
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(ContactListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/contacts/{contactId}`, but
         * is otherwise the same as [ContactServiceAsync.delete].
         */
        fun delete(contactId: String): CompletableFuture<HttpResponse> =
            delete(contactId, ContactDeleteParams.none())

        /** @see delete */
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see delete */
        fun delete(
            contactId: String,
            params: ContactDeleteParams = ContactDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(contactId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ContactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ContactDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(contactId, ContactDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/contacts/gdpr-delete`, but is
         * otherwise the same as [ContactServiceAsync.gdprDelete].
         */
        fun gdprDelete(params: ContactGdprDeleteParams): CompletableFuture<HttpResponse> =
            gdprDelete(params, RequestOptions.none())

        /** @see gdprDelete */
        fun gdprDelete(
            params: ContactGdprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see gdprDelete */
        fun gdprDelete(
            publicGdprDeleteInput: PublicGdprDeleteInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            gdprDelete(
                ContactGdprDeleteParams.builder()
                    .publicGdprDeleteInput(publicGdprDeleteInput)
                    .build(),
                requestOptions,
            )

        /** @see gdprDelete */
        fun gdprDelete(
            publicGdprDeleteInput: PublicGdprDeleteInput
        ): CompletableFuture<HttpResponse> =
            gdprDelete(publicGdprDeleteInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/contacts/{contactId}`, but is
         * otherwise the same as [ContactServiceAsync.get].
         */
        fun get(
            contactId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(contactId, ContactGetParams.none())

        /** @see get */
        fun get(
            contactId: String,
            params: ContactGetParams = ContactGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().contactId(contactId).build(), requestOptions)

        /** @see get */
        fun get(
            contactId: String,
            params: ContactGetParams = ContactGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(contactId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ContactGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: ContactGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            contactId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(contactId, ContactGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/contacts/merge`, but is
         * otherwise the same as [ContactServiceAsync.merge].
         */
        fun merge(
            params: ContactMergeParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(params, RequestOptions.none())

        /** @see merge */
        fun merge(
            params: ContactMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see merge */
        fun merge(
            publicMergeInput: PublicMergeInput,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(
                ContactMergeParams.builder().publicMergeInput(publicMergeInput).build(),
                requestOptions,
            )

        /** @see merge */
        fun merge(
            publicMergeInput: PublicMergeInput
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(publicMergeInput, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/contacts/search`, but is
         * otherwise the same as [ContactServiceAsync.search].
         */
        fun search(
            params: ContactSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: ContactSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                ContactSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
