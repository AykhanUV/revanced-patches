package app.revanced.patches.music.general.startpage

import app.revanced.util.fingerprint.legacyFingerprint
import app.revanced.util.or
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

internal val coldStartUpFingerprint = legacyFingerprint(
    name = "coldStartUpFingerprint",
    returnType = "Ljava/lang/String;",
    accessFlags = AccessFlags.PUBLIC or AccessFlags.FINAL,
    parameters = emptyList(),
    opcodes = listOf(
        Opcode.GOTO,
        Opcode.CONST_STRING,
        Opcode.RETURN_OBJECT
    ),
    strings = listOf("FEmusic_library_sideloaded_tracks", "FEmusic_home")
)

