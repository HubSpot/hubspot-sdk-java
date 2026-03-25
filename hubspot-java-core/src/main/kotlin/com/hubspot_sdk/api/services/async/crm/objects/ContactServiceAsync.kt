// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObject
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

    /**
     * Create a CRM object with the given properties and return a copy of the object, including the
     * ID. Documentation and examples for creating standard objects is provided.
     */
    fun create(
        objectType: String,
        params: ContactCreateParams,
    ): CompletableFuture<SimplePublicObject> = create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: ContactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: ContactCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /**
     * Perform a partial update of an Object identified by `{objectId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{objectId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(
        objectId: String,
        params: ContactUpdateParams,
    ): CompletableFuture<SimplePublicObject> = update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: ContactUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: ContactUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContactUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of objects. Control what is returned via the `properties` query param. */
    fun list(objectType: String): CompletableFuture<ContactListPageAsync> =
        list(objectType, ContactListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: ContactListParams = ContactListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactListPageAsync> =
        list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: ContactListParams = ContactListParams.none(),
    ): CompletableFuture<ContactListPageAsync> = list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ContactListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContactListPageAsync>

    /** @see list */
    fun list(params: ContactListParams): CompletableFuture<ContactListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        objectType: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContactListPageAsync> =
        list(objectType, ContactListParams.none(), requestOptions)

    /** Move an Object identified by `{objectId}` to the recycling bin. */
    fun delete(objectId: String, params: ContactDeleteParams): CompletableFuture<Void?> =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: ContactDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ContactDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ContactDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Permanently delete a contact and all associated content to follow GDPR. Use optional property
     * `idProperty` set to `email` to identify contact by email address. If email address is not
     * found, the email address will be added to a blocklist and prevent it from being used in the
     * future. Learn more about
     * [permanently deleting contacts](https://knowledge.hubspot.com/privacy-and-consent/how-do-i-perform-a-gdpr-delete-in-hubspot).
     */
    fun gdprDelete(objectType: String, params: ContactGdprDeleteParams): CompletableFuture<Void?> =
        gdprDelete(objectType, params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(
        objectType: String,
        params: ContactGdprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        gdprDelete(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see gdprDelete */
    fun gdprDelete(params: ContactGdprDeleteParams): CompletableFuture<Void?> =
        gdprDelete(params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(
        params: ContactGdprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Read an Object identified by `{objectId}`. `{objectId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(
        objectId: String,
        params: ContactGetParams,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        objectId: String,
        params: ContactGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(params: ContactGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ContactGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /**
     * Merge two CRM objects of the same type by specifying one as the primary object and the other
     * as the object to be merged into it.
     */
    fun merge(
        objectType: String,
        params: ContactMergeParams,
    ): CompletableFuture<SimplePublicObject> = merge(objectType, params, RequestOptions.none())

    /** @see merge */
    fun merge(
        objectType: String,
        params: ContactMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        merge(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see merge */
    fun merge(params: ContactMergeParams): CompletableFuture<SimplePublicObject> =
        merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: ContactMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /**
     * Execute a search query to find CRM objects of a given type, using specified filters and
     * properties. The search can be customized with filters, sorting, and pagination options.
     */
    fun search(
        objectType: String,
        params: ContactSearchParams,
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(objectType, params, RequestOptions.none())

    /** @see search */
    fun search(
        objectType: String,
        params: ContactSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see search */
    fun search(
        params: ContactSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ContactSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

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

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}`, but is
         * otherwise the same as [ContactServiceAsync.create].
         */
        fun create(
            objectType: String,
            params: ContactCreateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(objectType, params, RequestOptions.none())

        /** @see create */
        fun create(
            objectType: String,
            params: ContactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        fun create(
            params: ContactCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/{objectType}/{objectId}`, but
         * is otherwise the same as [ContactServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: ContactUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: ContactUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

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
         * Returns a raw HTTP response for `get /crm/objects/2026-03/{objectType}`, but is otherwise
         * the same as [ContactServiceAsync.list].
         */
        fun list(objectType: String): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(objectType, ContactListParams.none())

        /** @see list */
        fun list(
            objectType: String,
            params: ContactListParams = ContactListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        fun list(
            objectType: String,
            params: ContactListParams = ContactListParams.none(),
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(objectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ContactListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>>

        /** @see list */
        fun list(
            params: ContactListParams
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContactListPageAsync>> =
            list(objectType, ContactListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/{objectType}/{objectId}`,
         * but is otherwise the same as [ContactServiceAsync.delete].
         */
        fun delete(objectId: String, params: ContactDeleteParams): CompletableFuture<HttpResponse> =
            delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: ContactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(params: ContactDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ContactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/gdpr-delete`, but
         * is otherwise the same as [ContactServiceAsync.gdprDelete].
         */
        fun gdprDelete(
            objectType: String,
            params: ContactGdprDeleteParams,
        ): CompletableFuture<HttpResponse> = gdprDelete(objectType, params, RequestOptions.none())

        /** @see gdprDelete */
        fun gdprDelete(
            objectType: String,
            params: ContactGdprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            gdprDelete(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see gdprDelete */
        fun gdprDelete(params: ContactGdprDeleteParams): CompletableFuture<HttpResponse> =
            gdprDelete(params, RequestOptions.none())

        /** @see gdprDelete */
        fun gdprDelete(
            params: ContactGdprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/{objectType}/{objectId}`, but
         * is otherwise the same as [ContactServiceAsync.get].
         */
        fun get(
            objectId: String,
            params: ContactGetParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            params: ContactGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            params: ContactGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ContactGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/merge`, but is
         * otherwise the same as [ContactServiceAsync.merge].
         */
        fun merge(
            objectType: String,
            params: ContactMergeParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(objectType, params, RequestOptions.none())

        /** @see merge */
        fun merge(
            objectType: String,
            params: ContactMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see merge */
        fun merge(
            params: ContactMergeParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(params, RequestOptions.none())

        /** @see merge */
        fun merge(
            params: ContactMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/search`, but is
         * otherwise the same as [ContactServiceAsync.search].
         */
        fun search(
            objectType: String,
            params: ContactSearchParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(objectType, params, RequestOptions.none())

        /** @see search */
        fun search(
            objectType: String,
            params: ContactSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see search */
        fun search(
            params: ContactSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: ContactSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>
    }
}
