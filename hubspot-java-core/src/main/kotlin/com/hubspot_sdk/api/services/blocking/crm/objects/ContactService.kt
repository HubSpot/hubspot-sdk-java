// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactListPage
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactListParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactMergeParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactSearchParams
import com.hubspot_sdk.api.models.crm.objects.contacts.ContactUpdateParams
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

    /**
     * Create a task with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard tasks is provided.
     */
    fun create(objectType: String, params: ContactCreateParams): SimplePublicObject =
        create(objectType, params, RequestOptions.none())

    /** @see create */
    fun create(
        objectType: String,
        params: ContactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see create */
    fun create(params: ContactCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ContactCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Perform a partial update of an Object identified by `{taskId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{taskId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(objectId: String, params: ContactUpdateParams): SimplePublicObject =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: ContactUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: ContactUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ContactUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of tasks. Control what is returned via the `properties` query param. */
    fun list(objectType: String): ContactListPage = list(objectType, ContactListParams.none())

    /** @see list */
    fun list(
        objectType: String,
        params: ContactListParams = ContactListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactListPage = list(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see list */
    fun list(
        objectType: String,
        params: ContactListParams = ContactListParams.none(),
    ): ContactListPage = list(objectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ContactListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContactListPage

    /** @see list */
    fun list(params: ContactListParams): ContactListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(objectType: String, requestOptions: RequestOptions): ContactListPage =
        list(objectType, ContactListParams.none(), requestOptions)

    /** Move an Object identified by `{taskId}` to the recycling bin. */
    fun delete(objectId: String, params: ContactDeleteParams) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: ContactDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ContactDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ContactDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    fun gdprDelete(objectType: String, params: ContactGdprDeleteParams) =
        gdprDelete(objectType, params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(
        objectType: String,
        params: ContactGdprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = gdprDelete(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see gdprDelete */
    fun gdprDelete(params: ContactGdprDeleteParams) = gdprDelete(params, RequestOptions.none())

    /** @see gdprDelete */
    fun gdprDelete(
        params: ContactGdprDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Read an Object identified by `{taskId}`. `{taskId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(objectId: String, params: ContactGetParams): SimplePublicObjectWithAssociations =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        objectId: String,
        params: ContactGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(params: ContactGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ContactGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    fun merge(objectType: String, params: ContactMergeParams): SimplePublicObject =
        merge(objectType, params, RequestOptions.none())

    /** @see merge */
    fun merge(
        objectType: String,
        params: ContactMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = merge(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see merge */
    fun merge(params: ContactMergeParams): SimplePublicObject = merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: ContactMergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Execute a search for tasks based on the provided criteria, including filters, properties, and
     * sorting options. This allows for retrieving tasks that match specific conditions or property
     * values.
     */
    fun search(
        objectType: String,
        params: ContactSearchParams,
    ): CollectionResponseWithTotalSimplePublicObject =
        search(objectType, params, RequestOptions.none())

    /** @see search */
    fun search(
        objectType: String,
        params: ContactSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see search */
    fun search(params: ContactSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ContactSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** A view of [ContactService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContactService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}`, but is
         * otherwise the same as [ContactService.create].
         */
        @MustBeClosed
        fun create(
            objectType: String,
            params: ContactCreateParams,
        ): HttpResponseFor<SimplePublicObject> = create(objectType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            objectType: String,
            params: ContactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ContactCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ContactCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/{objectType}/{objectId}`, but
         * is otherwise the same as [ContactService.update].
         */
        @MustBeClosed
        fun update(
            objectId: String,
            params: ContactUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: ContactUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

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
         * Returns a raw HTTP response for `get /crm/objects/2026-03/{objectType}`, but is otherwise
         * the same as [ContactService.list].
         */
        @MustBeClosed
        fun list(objectType: String): HttpResponseFor<ContactListPage> =
            list(objectType, ContactListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: ContactListParams = ContactListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactListPage> =
            list(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            params: ContactListParams = ContactListParams.none(),
        ): HttpResponseFor<ContactListPage> = list(objectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ContactListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContactListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ContactListParams): HttpResponseFor<ContactListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            objectType: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContactListPage> =
            list(objectType, ContactListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/{objectType}/{objectId}`,
         * but is otherwise the same as [ContactService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String, params: ContactDeleteParams): HttpResponse =
            delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: ContactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ContactDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ContactDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/gdpr-delete`, but
         * is otherwise the same as [ContactService.gdprDelete].
         */
        @MustBeClosed
        fun gdprDelete(objectType: String, params: ContactGdprDeleteParams): HttpResponse =
            gdprDelete(objectType, params, RequestOptions.none())

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            objectType: String,
            params: ContactGdprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            gdprDelete(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(params: ContactGdprDeleteParams): HttpResponse =
            gdprDelete(params, RequestOptions.none())

        /** @see gdprDelete */
        @MustBeClosed
        fun gdprDelete(
            params: ContactGdprDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/{objectType}/{objectId}`, but
         * is otherwise the same as [ContactService.get].
         */
        @MustBeClosed
        fun get(
            objectId: String,
            params: ContactGetParams,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: ContactGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: ContactGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ContactGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/merge`, but is
         * otherwise the same as [ContactService.merge].
         */
        @MustBeClosed
        fun merge(
            objectType: String,
            params: ContactMergeParams,
        ): HttpResponseFor<SimplePublicObject> = merge(objectType, params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            objectType: String,
            params: ContactMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            merge(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see merge */
        @MustBeClosed
        fun merge(params: ContactMergeParams): HttpResponseFor<SimplePublicObject> =
            merge(params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            params: ContactMergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/search`, but is
         * otherwise the same as [ContactService.search].
         */
        @MustBeClosed
        fun search(
            objectType: String,
            params: ContactSearchParams,
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(objectType, params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            objectType: String,
            params: ContactSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see search */
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
    }
}
