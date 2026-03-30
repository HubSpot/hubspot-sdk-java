// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.notes.NoteCreateParams
import com.hubspot_sdk.api.models.crm.objects.notes.NoteDeleteParams
import com.hubspot_sdk.api.models.crm.objects.notes.NoteGetParams
import com.hubspot_sdk.api.models.crm.objects.notes.NoteListPageAsync
import com.hubspot_sdk.api.models.crm.objects.notes.NoteListParams
import com.hubspot_sdk.api.models.crm.objects.notes.NoteSearchParams
import com.hubspot_sdk.api.models.crm.objects.notes.NoteUpdateParams
import com.hubspot_sdk.api.services.async.crm.objects.notes.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NoteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NoteServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Create a note with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard notes is provided.
     */
    fun create(params: NoteCreateParams): CompletableFuture<SimplePublicObject> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        create(
            NoteCreateParams.builder()
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
     * Perform a partial update of an Object identified by `{noteId}`or optionally a unique property
     * value as specified by the `idProperty` query param. `{noteId}` refers to the internal object
     * ID by default, and the `idProperty` query param refers to a property whose values are unique
     * for the object. Provided property values will be overwritten. Read-only and non-existent
     * properties will result in an error. Properties values can be cleared by passing an empty
     * string.
     */
    fun update(noteId: String, params: NoteUpdateParams): CompletableFuture<SimplePublicObject> =
        update(noteId, params, RequestOptions.none())

    /** @see update */
    fun update(
        noteId: String,
        params: NoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        update(params.toBuilder().noteId(noteId).build(), requestOptions)

    /** @see update */
    fun update(params: NoteUpdateParams): CompletableFuture<SimplePublicObject> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** Read a page of notes. Control what is returned via the `properties` query param. */
    fun list(): CompletableFuture<NoteListPageAsync> = list(NoteListParams.none())

    /** @see list */
    fun list(
        params: NoteListParams = NoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NoteListPageAsync>

    /** @see list */
    fun list(params: NoteListParams = NoteListParams.none()): CompletableFuture<NoteListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NoteListPageAsync> =
        list(NoteListParams.none(), requestOptions)

    /** Move an Object identified by `{noteId}` to the recycling bin. */
    fun delete(noteId: String): CompletableFuture<Void?> = delete(noteId, NoteDeleteParams.none())

    /** @see delete */
    fun delete(
        noteId: String,
        params: NoteDeleteParams = NoteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().noteId(noteId).build(), requestOptions)

    /** @see delete */
    fun delete(
        noteId: String,
        params: NoteDeleteParams = NoteDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(noteId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NoteDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: NoteDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(noteId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(noteId, NoteDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{noteId}`. `{noteId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(noteId: String): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(noteId, NoteGetParams.none())

    /** @see get */
    fun get(
        noteId: String,
        params: NoteGetParams = NoteGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params.toBuilder().noteId(noteId).build(), requestOptions)

    /** @see get */
    fun get(
        noteId: String,
        params: NoteGetParams = NoteGetParams.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(noteId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: NoteGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObjectWithAssociations>

    /** @see get */
    fun get(params: NoteGetParams): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        noteId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        get(noteId, NoteGetParams.none(), requestOptions)

    /**
     * Execute a search for notes using filters, sorting options, and other query parameters to
     * refine the results. This endpoint allows for complex queries to locate specific notes within
     * the CRM system.
     */
    fun search(
        params: NoteSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: NoteSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(
            NoteSearchParams.builder().publicObjectSearchRequest(publicObjectSearchRequest).build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [NoteServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NoteServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/notes`, but is otherwise the
         * same as [NoteServiceAsync.create].
         */
        fun create(
            params: NoteCreateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: NoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /** @see create */
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            create(
                NoteCreateParams.builder()
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
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/notes/{noteId}`, but is
         * otherwise the same as [NoteServiceAsync.update].
         */
        fun update(
            noteId: String,
            params: NoteUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(noteId, params, RequestOptions.none())

        /** @see update */
        fun update(
            noteId: String,
            params: NoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params.toBuilder().noteId(noteId).build(), requestOptions)

        /** @see update */
        fun update(
            params: NoteUpdateParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: NoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/notes`, but is otherwise the
         * same as [NoteServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NoteListPageAsync>> =
            list(NoteListParams.none())

        /** @see list */
        fun list(
            params: NoteListParams = NoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NoteListPageAsync>>

        /** @see list */
        fun list(
            params: NoteListParams = NoteListParams.none()
        ): CompletableFuture<HttpResponseFor<NoteListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NoteListPageAsync>> =
            list(NoteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/notes/{noteId}`, but is
         * otherwise the same as [NoteServiceAsync.delete].
         */
        fun delete(noteId: String): CompletableFuture<HttpResponse> =
            delete(noteId, NoteDeleteParams.none())

        /** @see delete */
        fun delete(
            noteId: String,
            params: NoteDeleteParams = NoteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().noteId(noteId).build(), requestOptions)

        /** @see delete */
        fun delete(
            noteId: String,
            params: NoteDeleteParams = NoteDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(noteId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: NoteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: NoteDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            noteId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(noteId, NoteDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/notes/{noteId}`, but is
         * otherwise the same as [NoteServiceAsync.get].
         */
        fun get(
            noteId: String
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(noteId, NoteGetParams.none())

        /** @see get */
        fun get(
            noteId: String,
            params: NoteGetParams = NoteGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params.toBuilder().noteId(noteId).build(), requestOptions)

        /** @see get */
        fun get(
            noteId: String,
            params: NoteGetParams = NoteGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(noteId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: NoteGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>>

        /** @see get */
        fun get(
            params: NoteGetParams
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            noteId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> =
            get(noteId, NoteGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/notes/search`, but is
         * otherwise the same as [NoteServiceAsync.search].
         */
        fun search(
            params: NoteSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: NoteSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /** @see search */
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(
                NoteSearchParams.builder()
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
