package tera.gameserver.network.serverpackets;

import java.nio.ByteBuffer;

import tera.gameserver.network.ServerPacketType;

/**
 * Серверный пакет, говорящий об результате попытки создании персонажа.
 *
 * @author Ronn Mod Evestu
 */
public class CreatePlayerResult extends ServerConstPacket
{
	private static final CreatePlayerResult instance = new CreatePlayerResult();

	public static CreatePlayerResult getInstance()
	{
		return instance;
	}

	@Override
	public ServerPacketType getPacketType()
	{
		return ServerPacketType.S_CREATE_USER;
	}

	@Override
	protected void writeImpl(ByteBuffer buffer)
	{
		writeOpcode(buffer);
		writeByte(buffer, 1);
	}
}